package com.cmjd.lostfound.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "requester_id")
    private User requester;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;

    // Getters and setters

}

