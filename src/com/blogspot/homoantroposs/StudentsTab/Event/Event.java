package com.blogspot.homoantroposs.StudentsTab.Event;

import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Event implements Serializable, Comparable <Event> {

    private String nameOfEvent;
    private String placeOfEvent;
    private String adressOfEvent;
    private TypesOfEvents typeOfEvent;
    private LocalDate dateOfStart;
    private LocalDate dateOfEnd;
    private LocalDate datesOfWeek;
    private Integer duration;
    private LocalTime timeOfStart;
    private LocalTime timeOfEnd;
    private Integer durationInHours;
    private GroupOfStudents participants;
    private String description;
    private String owner;
    private String ownersPhoneNumber;
    private String ownersEmail;

    public Event(String nameOfEvent, String placeOfEvent, String adressOfEvent, TypesOfEvents typeOfEvent, LocalDate dateOfStart, LocalDate dateOfEnd, LocalDate datesOfWeek, Integer duration, LocalTime timeOfStart, LocalTime timeOfEnd, Integer durationInHours, GroupOfStudents participants, String description, String owner, String ownersPhoneNumber, String ownersEmail) {
        this.nameOfEvent = nameOfEvent;
        this.placeOfEvent = placeOfEvent;
        this.adressOfEvent = adressOfEvent;
        this.typeOfEvent = typeOfEvent;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
        this.datesOfWeek = datesOfWeek;
        this.duration = duration;
        this.timeOfStart = timeOfStart;
        this.timeOfEnd = timeOfEnd;
        this.durationInHours = durationInHours;
        this.participants = participants;
        this.description = description;
        this.owner = owner;
        this.ownersPhoneNumber = ownersPhoneNumber;
        this.ownersEmail = ownersEmail;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public String getPlaceOfEvent() {
        return placeOfEvent;
    }

    public void setPlaceOfEvent(String placeOfEvent) {
        this.placeOfEvent = placeOfEvent;
    }

    public String getAdressOfEvent() {
        return adressOfEvent;
    }

    public void setAdressOfEvent(String adressOfEvent) {
        this.adressOfEvent = adressOfEvent;
    }

    public TypesOfEvents getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(TypesOfEvents typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public LocalDate getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(LocalDate dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public LocalDate getDatesOfWeek() {
        return datesOfWeek;
    }

    public void setDatesOfWeek(LocalDate datesOfWeek) {
        this.datesOfWeek = datesOfWeek;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalTime getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(LocalTime timeOfStart) {
        this.timeOfStart = timeOfStart;
    }

    public LocalTime getTimeOfEnd() {
        return timeOfEnd;
    }

    public void setTimeOfEnd(LocalTime timeOfEnd) {
        this.timeOfEnd = timeOfEnd;
    }

    public Integer getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(Integer durationInHours) {
        this.durationInHours = durationInHours;
    }

    public GroupOfStudents getParticipants() {
        return participants;
    }

    public void setParticipants(GroupOfStudents participants) {
        this.participants = participants;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnersPhoneNumber() {
        return ownersPhoneNumber;
    }

    public void setOwnersPhoneNumber(String ownersPhoneNumber) {
        this.ownersPhoneNumber = ownersPhoneNumber;
    }

    public String getOwnersEmail() {
        return ownersEmail;
    }

    public void setOwnersEmail(String ownersEmail) {
        this.ownersEmail = ownersEmail;
    }

    public String toString () {
        return String.format("%15s %15s %15s", nameOfEvent, placeOfEvent, dateOfStart);
    }

    public int compareTo (Event event) {
       return this.dateOfStart.compareTo(event.dateOfStart);
    }
}
