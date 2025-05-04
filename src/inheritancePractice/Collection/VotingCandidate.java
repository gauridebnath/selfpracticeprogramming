package inheritancePractice.Collection;

import java.util.*;

public class VotingCandidate {
    public static void main(String[] args) {
        ArrayList<String> votingCandidateList = new ArrayList<>();


        String input;

        do {

            System.out.println("voting machine system");
            System.out.println("candidate available  Modi , Rahul , Kejriwal ");
            System.out.println("Enter stop Finish Voting");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();


            switch (input) {
                case "Modi":
                    System.out.println("Voted for :" + input);
                    votingCandidateList.add(input);
                    break;

                case "Rahul":
                    System.out.println("Voted for:" + input);
                    votingCandidateList.add(input);
                    break;

                case "Kejriwal":
                    System.out.println("Voted for:" + input);
                    votingCandidateList.add(input);
                    break;

                case "Stop":
                    System.out.println("voting count:" + votingCandidateList);
                    Set<String> votingCandidateSet = new HashSet<>(votingCandidateList);

                    for (String string : votingCandidateSet) {
                        int frequency = Collections.frequency(votingCandidateList, string);
                        System.out.println(string +"   :"+  frequency);

                    }

            }

        } while (!input.equalsIgnoreCase("Stop")) ;


    }
}