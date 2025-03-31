package br.com.primeshoes.api.controllers;

import br.com.primeshoes.api.dtos.AdminPanelDTO;
import br.com.primeshoes.api.services.AdminPanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AdminPanelController {

    @Autowired
    private AdminPanelService adminPanelService;

    @GetMapping("/admin/users")
    public List<AdminPanelDTO.UserDTO> manageUsers() {
        return adminPanelService.manageUsers();
    }

    @GetMapping("/admin/products")
    public List<AdminPanelDTO.ProductDTO> manageProducts() {
        return adminPanelService.manageProducts();
    }

    @GetMapping("/admin/reports")
    public AdminPanelDTO.ReportDTO viewReports() {
        return adminPanelService.viewReports();
    }
}