package com.ssafy.ssafit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ssafy.ssafit.domain.Video;

public interface VideoRepository extends JpaRepository<Video, Long>{
}
