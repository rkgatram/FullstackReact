package com.rkgatram.ppmtool.repositories;

import com.rkgatram.ppmtool.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by ravikumar.g
 * Date 2021-07-20
 */
public interface ProjectRepository extends JpaRepository<Project, Long> {

    Optional<Project> findByProjectIdentifier(String projectId);

    @Override
    List<Project> findAll();
}
