package br.com.primeshoes.api.services;

import br.com.primeshoes.api.dtos.AdminPanelDTO;
import br.com.primeshoes.api.mappers.AdminPanelMapper;
import br.com.primeshoes.api.repositories.AdminPanelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminPanelService {

    @Autowired
    private AdminPanelRepository adminPanelRepository;

    @Autowired
    private AdminPanelMapper adminPanelMapper;

    public List<AdminPanelDTO.UserDTO> manageUsers() {
        return adminPanelMapper.toUserDTOList(adminPanelRepository.findAll().get(0).manageUsers());
    }

    public List<AdminPanelDTO.ProductDTO> manageProducts() {
        return adminPanelMapper.toProductDTOList(adminPanelRepository.findAll().get(0).manageProducts());
    }

    public AdminPanelDTO.ReportDTO viewReports() {
        return adminPanelMapper.toReportDTO(adminPanelRepository.findAll().get(0).viewReports());
    }
}