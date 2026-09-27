package webagenda.agenda.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webagenda.agenda.web.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
}
