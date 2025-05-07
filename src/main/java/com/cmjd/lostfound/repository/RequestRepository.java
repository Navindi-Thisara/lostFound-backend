package com.cmjd.lostfound.repository;

import com.cmjd.lostfound.model.Request;
import com.cmjd.lostfound.model.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {
    List<Request> findByStatus(RequestStatus status);
}

