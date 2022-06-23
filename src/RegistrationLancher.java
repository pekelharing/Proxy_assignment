import model.ConferenceRegistration;
import model.Participant;
import model.ProxyConferenceregistration;
import model.RealConferenceRegistration;

public class RegistrationLancher {

    public static void main(String[] args) {
        ConferenceRegistration proxyConferenceregistration = new ProxyConferenceregistration(new RealConferenceRegistration());

        for (int i = 0; i < 106; i++) {
            Participant participant = new Participant(i, "Sam" + i);
            proxyConferenceregistration.registerParticipant(participant);
        }
    }

}
