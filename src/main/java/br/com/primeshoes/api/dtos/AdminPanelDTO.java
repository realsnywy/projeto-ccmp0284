package br.com.primeshoes.api.dtos;

import java.util.List;

public class AdminPanelDTO {

    public static record UserDTO(int id, String name, String email) {}

    public static record ProductDTO(int id, String name, float price) {}

    public static record ReportDTO(String reportData) {}
}