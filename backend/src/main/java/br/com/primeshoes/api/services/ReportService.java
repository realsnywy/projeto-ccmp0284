package br.com.primeshoes.api.services;

import br.com.primeshoes.api.dtos.ReportDTO;
import br.com.primeshoes.api.entities.Report;
import br.com.primeshoes.api.mappers.ReportMapper;
import br.com.primeshoes.api.repositories.ReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReportService {

    private final ReportRepository reportRepository;
    private final ReportMapper reportMapper;

    public ReportService(ReportRepository reportRepository, ReportMapper reportMapper) {
        this.reportRepository = reportRepository;
        this.reportMapper = reportMapper;
    }

    public ReportDTO createReport(ReportDTO reportDTO) {
        Report report = reportMapper.toEntity(reportDTO);
        Report savedReport = reportRepository.save(report);
        return reportMapper.toDTO(savedReport);
    }

    public Optional<ReportDTO> getReport(Long id) {
        return reportRepository.findById(id).map(reportMapper::toDTO);
    }

    public ReportDTO updateReport(Long id, ReportDTO reportDTO) {
        if (!reportRepository.existsById(id)) {
            throw new IllegalArgumentException("Report not found with id: " + id);
        }
        Report report = reportMapper.toEntity(reportDTO);
        report.setId(id);
        Report updatedReport = reportRepository.save(report);
        return reportMapper.toDTO(updatedReport);
    }

    public void deleteReport(Long id) {
        if (!reportRepository.existsById(id)) {
            throw new IllegalArgumentException("Report not found with id: " + id);
        }
        reportRepository.deleteById(id);
    }

    public List<ReportDTO> getAllReports() {
        List<Report> reports = reportRepository.findAll();
        return reports.stream().map(reportMapper::toDTO).collect(Collectors.toList());
    }

    // Removed duplicate updateReport method
}