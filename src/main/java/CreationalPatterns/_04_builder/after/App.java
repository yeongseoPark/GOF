package CreationalPatterns._04_builder.after;

import CreationalPatterns._04_builder.before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}
