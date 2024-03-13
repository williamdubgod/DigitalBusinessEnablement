package br.com.fiap.banconacional.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.banconacional.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    // @Query("SELECT c FROM categorias WHERE ....") //JPQL
    // List<Categoria> buscaOsDadosPeloMeuCriterioMaisMaluco(String nome);
    
}
