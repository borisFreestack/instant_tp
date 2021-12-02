package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class ClockMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private Date date;

    private Instant instant;

    @Column(name = "zonedDateTime", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime zonedDateTime;

    @Column(name = "local_date", columnDefinition = "DATE")
    private LocalDate localDate;

    @Column(name = "local_date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime;

    @Column(name = "offset_time", columnDefinition = "TIME WITH TIME ZONE")
    @JsonFormat(timezone="Europe/Zagreb")
    private OffsetTime offsetTime;

    @Column(name = "offset_date_time", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime offsetDateTime;

    public UUID getId() {
        return id;
    }

    public ClockMachine setId(UUID id) {
        this.id = id;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public ClockMachine setDate(Date date) {
        this.date = date;
        return this;
    }

    public Instant getInstant() {
        return instant;
    }

    public ClockMachine setInstant(Instant instant) {
        this.instant = instant;
        return this;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public ClockMachine setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
        return this;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public ClockMachine setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
        return this;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public ClockMachine setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        return this;
    }

    public OffsetTime getOffsetTime() {
        return offsetTime;
    }

    public ClockMachine setOffsetTime(OffsetTime offsetTime) {
        this.offsetTime = offsetTime;
        return this;
    }

    public OffsetDateTime getOffsetDateTime() {
        return offsetDateTime;
    }

    public ClockMachine setOffsetDateTime(OffsetDateTime offsetDateTime) {
        this.offsetDateTime = offsetDateTime;
        return this;
    }
}
