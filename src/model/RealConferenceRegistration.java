package model;

import java.util.ArrayList;
import java.util.List;

// TODO
//This class supposedly is part of a commercial package which must be left untouched.
//However, we, the company using this class like to modify its behaviour slightly in
//that we want to add a maximum of participants to the registration of a conference,
//and we'd like calling classes to be able to print a list with ID's and names of the
//participants

public class RealConferenceRegistration implements ConferenceRegistration {

    private List<Participant> participants;


    public RealConferenceRegistration() {
        participants = new ArrayList<>();
    }

    @Override
    public int noOfVisitors() {
        return participants.size();
    }

    @Override
    public void registerParticipant(Participant participant) {
        participants.add(participant);
        System.out.println("Participant:  " + participant.getName());
    }
}
