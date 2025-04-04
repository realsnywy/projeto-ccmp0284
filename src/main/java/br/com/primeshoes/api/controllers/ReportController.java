package br.com.primeshoes.api.controllers;

import br.com.primeshoes.api.dtos.ReportDTO;
import br.com.primeshoes.api.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping
    public ResponseEntity<ReportDTO> createReport(@RequestBody ReportDTO reportDTO) {
        ReportDTO createdReportDTO = reportService.createReport(reportDTO);
        return ResponseEntity.ok(createdReportDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReportDTO> getReportById(@PathVariable Long id) {
        ReportDTO reportDTO = reportService.getReport(id).orElseThrow(() -> new RuntimeException("Report not found"));
        return ResponseEntity.ok(reportDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReportDTO> updateReport(@PathVariable Long id, @RequestBody ReportDTO reportDTO) {
        ReportDTO updatedReportDTO = reportService.updateReport(id, reportDTO);
        return ResponseEntity.ok(updatedReportDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReport(@PathVariable Long id) {
        reportService.deleteReport(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ReportDTO>> getAllReports() {
        List<ReportDTO> reports = reportService.getAllReports();
        return ResponseEntity.ok(reports);
    }
}