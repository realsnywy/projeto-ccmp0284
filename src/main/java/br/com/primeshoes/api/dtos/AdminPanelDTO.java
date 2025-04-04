package br.com.primeshoes.api.dtos;

public record AdminPanelDTO(
        UserDTO user,
        ProductDTO product,
        ReportDTO report) {

    public static record UserDTO(int id, String name, String email) {

        public UserDTO(long id2, String name2, String email2) {
            this((int) id2, name2, email2);
        }
    }

    public static record ProductDTO(int id, String name, float price) {

        public ProductDTO(Long id2, String name2, double price2) {
            this(id2.intValue(), name2, (float) price2);
        }
    }

    public static record ReportDTO(String reportData) {
    }
}