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
        return users.stream()
                .map(user -> new AdminPanelDTO.UserDTO(user.getId(), user.getName(), user.getEmail()))
                .collect(Collectors.toList());
    }

    public List<AdminPanelDTO.ProductDTO> toProductDTOList(List<Product> products) {
        return products.stream()
                .map(product -> new AdminPanelDTO.ProductDTO(product.getId(), product.getName(), product.getPrice()))
                .collect(Collectors.toList());
    }

    public AdminPanelDTO.ReportDTO toReportDTO(Report report) {
        return new AdminPanelDTO.ReportDTO(report.getReportData());
    }
}
