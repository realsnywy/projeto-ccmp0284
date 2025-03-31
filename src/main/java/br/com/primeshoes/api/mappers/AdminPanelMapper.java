package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.AdminPanelDTO;
import br.com.primeshoes.api.entities.AdminPanel;
import org.springframework.stereotype.Component;
import br.com.primeshoes.api.entities.User;
import br.com.primeshoes.api.entities.Product;
// import br.com.primeshoes.api.entities.Report;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdminPanelMapper {

    public List<AdminPanelDTO.UserDTO> toUserDTOList(List<User> users) {
        return users.stream().map(user -> {
            AdminPanelDTO.UserDTO dto = new AdminPanelDTO.UserDTO();
            dto.id = user.getId();
            dto.name = user.getName();
            dto.email = user.getEmail();
            return dto;
        }).collect(Collectors.toList());
    }

    public List<AdminPanelDTO.ProductDTO> toProductDTOList(List<Product> products) {
        return products.stream().map(product -> {
            AdminPanelDTO.ProductDTO dto = new AdminPanelDTO.ProductDTO();
            dto.id = product.getId();
            dto.name = product.getName();
            dto.price = product.getPrice();
            return dto;
        }).collect(Collectors.toList());
    }

    public AdminPanelDTO.ReportDTO toReportDTO(Report report) {
        AdminPanelDTO.ReportDTO dto = new AdminPanelDTO.ReportDTO();
        dto.reportData = report.getReportData();
        return dto;
    }
}