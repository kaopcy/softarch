package structural;

import java.util.HashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> members = new HashSet<>();

    public void addMember(HealthcareServiceable newMember) {
        members.add(newMember);
    }

    public void removeMember(HealthcareServiceable targetMember) {
        members.remove(targetMember);
    }

    @Override
    public void service() {
        for (HealthcareServiceable member : members) {
            member.service();
        }
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (HealthcareServiceable member : members) {
            price += member.getPrice();
        }
        return price;
    }

}
