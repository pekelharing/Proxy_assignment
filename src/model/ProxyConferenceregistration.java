package model;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProxyConferenceregistration implements ConferenceRegistration {
    private ConferenceRegistration conferenceRegistration;

    private static final int MAXIMUM_NUMBER_PARTICIPANTS = 95;

    public ProxyConferenceregistration(ConferenceRegistration conferenceRegistration) {
        this.conferenceRegistration = conferenceRegistration;

    }

    @Override
    public int noOfVisitors() {
        return conferenceRegistration.noOfVisitors();
    }

    @Override
    public void registerParticipant(Participant participant) {
        if (MAXIMUM_NUMBER_PARTICIPANTS >=  this.noOfVisitors()) {
            conferenceRegistration.registerParticipant(participant);
            //added behaviour
            thankYou(participant);
        } else {
            showWarning();
        }
    }

    private void thankYou(Participant participant) {
        System.out.printf("Thank you for registering, %s\n", participant.getName());
    }

    public void showWarning() {
        System.out.println("The total number of participants has been exceeded");
    }

    public void printParticipants() {

    }

}
