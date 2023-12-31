package backend.lightdriving.backend.dto;

import java.util.List;

import backend.lightdriving.backend.modelos.HistoricoUber;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class HistoricoUberDto {

    private int idConductor;

    private String nombre;

    private String apellido;

    HistoricoUber uberActual;

    List<HistoricoUber> historicoUbers;
    
}
