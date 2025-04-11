package br.com.primeshoes.api.repositories;

import br.com.primeshoes.api.entities.AdminPanel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminPanelRepository extends JpaRepository<AdminPanel, Integer> {
}