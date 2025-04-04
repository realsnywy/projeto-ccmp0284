package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.ReportDTO;
import br.com.primeshoes.api.entities.Report;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ReportMapper {

    public List<ReportDTO> toDTO(List<Report> reports) {
        if (reports == null) {
            return null;
        }
        return reports.stream()
                .map(report -> new ReportDTO(
                        report.getId(),
                        report.getTitle(),
                        report.getDescription(),
                        report.getCreatedDate()))
                .toList();
    }

    public Report toEntity(ReportDTO reportDTO) {
        if (reportDTO == null) {
            return null;
        }
        Report report = new Report();
        report.setId(reportDTO.id());
        report.setTitle(reportDTO.title());
        report.setDescription(reportDTO.description());
        report.setCreatedDate(reportDTO.createdDate());
        return report;
    }

    public ReportDTO toDTO(Report report) {
        if (report == null) {
            return null;
        }
        return new ReportDTO(
                report.getId(),
                report.getTitle(),
                report.getDescription(),
                report.getCreatedDate());
    }
}