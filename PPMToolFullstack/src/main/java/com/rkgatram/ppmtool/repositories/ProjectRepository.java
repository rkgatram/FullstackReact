package com.rkgatram.ppmtool.repositories;

import com.rkgatram.ppmtool.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ravikumar.g
 * Date 2021-07-20
 */
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
