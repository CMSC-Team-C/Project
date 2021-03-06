import java.util.Scanner;

public class MBTIdemo {
    public static void main(String[] args) {
        int e = 0, i = 0, s = 0, n = 0, t = 0, f = 0, j = 0, p = 0;
        char sex, response;
        
        System.out.println("What is your sex?");
        System.out.println("\tA.\tMale");
        System.out.println("\tB.\tFemale\n");

        response = response();

        if (response == 'A')
            sex = 'M';
        else
            sex = 'F';

        /*****Part 1*****/
        System.out.println("*****Part 1: Respond honestly to the question, choosing the answer that best describes the way you act in each situation.*****\n");

        //Q1
        System.out.println("1.\tWhen you go somewhere for the day, would you rather:");
        System.out.println("\tA.\tplan what you will do and when");
        System.out.println("\tB.\tjust go and let the day lead you where it does\n");
        
        response = response();

        if (response == 'A')
            j += 2;
        else
            p += 2;
        
        //Q2
        System.out.println("2.\tIf you were a teacher, would you rather teach");
        System.out.println("\tA.\tfact-based courses like math");
        System.out.println("\tB.\tcourses involving opinion or theory?\n");

        response = response();

        if (response == 'A')
            j += 2;
        else
            p += 2;
        
        //Q3
        System.out.println("3.\tAre you usually:");
        System.out.println("\tA.\ta \"good mixer\" with groups of people, or");
        System.out.println("\tB.\trather quiet and reserved?\n");

        response = response();

        if (response == 'A')
            e += 2;
        else
            i += 2;

        //Q4
        System.out.println("4.\tDo you more often let:");
        System.out.println("\tA.\tyour heart rule your head, or");
        System.out.println("\tB.\tyour head rule your heart?\n");

        response = response();

        if (response == 'A')
            f++;
        else
            t += 2;

        //Q5
        System.out.println("5.\tIn doing something that many other people do, would you rather:");
        System.out.println("\tA.\tdo it your own way, or");
        System.out.println("\tB.\tdo it in the accepted way?\n");

        response = response();

        if (response == 'A')
            n++;
        else
            s++;

        //Q6
        System.out.println("6.\tAmong your friends are you:");
        System.out.println("\tA.\tfull of news about everybody, or");
        System.out.println("\tB.\tone of the last to hear what is going on?\n");

        response = response();

        if (response == 'A')
            e += 2;
        else
            i++;
        
        //Q7
        System.out.println("7.\tDoes the idea of making a list of what you should get done over a weekend");
        System.out.println("\tA.\thelp you, or");
        System.out.println("\tB.\tstress you out, or");
        System.out.println("\tC.\tpositively depress you?\n");

        response = threeResponse();

        if (response == 'A')
            j++;
        else
            p++;

        //Q8
        System.out.println("8.\tWhen you have a special job to do, do you like to");
        System.out.println("\tA.\torganize it carefully before you start, or");
        System.out.println("\tB.\tfind out what is necessary as you go along?\n");

        response = response();

        if (response == 'A')
            j++;
        else
            p += 2;

        //Q9
        System.out.println("9.\tDo you tend to have");
        System.out.println("\tA.\tbroad friendships with many different people, or");
        System.out.println("\tB.\tdeep friendships with very few people?\n");

        response = response();

        if (response == 'A')
            e += 2;
        else
            i++;

        //Q10
        System.out.println("10.\tDo you admire more the people who are");
        System.out.println("\tA.\tnormal-acting to never make themselves the center of attention, or");
        System.out.println("\tB.\ttoo original and individual to care whether they are the center of attention or not?\n");

        response = response();

        if (response == 'A')
            s++;
        else
            n += 2;

        //Q11
        System.out.println("11.\tDo you prefer to");
        System.out.println("\tA.\tarrange picnics, parties, etc., well in advance, or");
        System.out.println("\tB.\tbe free to do whatever looks like fun when the time comes?\n");

        response = response();

        if (response == 'A')
            j += 2;
        else
            p++;

        //Q12
        System.out.println("12.\tDo you usually get along better with");
        System.out.println("\tA.\trealistic people, or");
        System.out.println("\tB.\timaginative people?\n");

        response = response();

        if (response == 'A')
            s++;
        else
            n += 2;

        //Q13
        System.out.println("13.\tWhen you are with a group of people, would you usually rather");
        System.out.println("\tA.\tjoin in the talk of the group, or");
        System.out.println("\tB.\tstand back and listen first?\n");

        response = response();

        if (response == 'A')
            e++;
        else
            i += 2;

        //Q14
        System.out.println("14.\tIs it a higher compliment to be called");
        System.out.println("\tA.\ta person of real feeling, or");
        System.out.println("\tB.\ta consistently reasonable person?\n");

        response = response();

        if (response == 'A')
            f++;
        else
            t += 2;

        //Q15
        System.out.println("15.\tWhen reading for pleasure, do you");
        System.out.println("\tA.\tenjoy odd/original ways of saying things, or");
        System.out.println("\tB.\tprefer writers to say exactly what they mean?\n");

        response = response();

        if (response == 'B')
            s++;

        //Q16
        System.out.println("16.\tDo you");
        System.out.println("\tA.\ttalk easily to almost anyone for as long as you have to, or");
        System.out.println("\tB.\tfind a lot to say only to certain people or under certain conditions?\n");

        response = response();

        if (response == 'A')
            e += 2;
        else
            i += 2;

        //Q17
        System.out.println("17.\tDoes following a schedule");
        System.out.println("\tA.\tappeal to you, or");
        System.out.println("\tB.\tcramp you?\n");

        response = response();

        if (response == 'A')
            j += 2;
        else
            p += 2;

        //Q18
        System.out.println("18.\tWhen it is settled well in advance that you will do a certain thing at a certain time, do you find it");
        System.out.println("\tA.\tnice to be able to plan accordingly, or");
        System.out.println("\tB.\ta little unpleasant to be tied down?\n");

        response = response();

        if (response == 'A')
            j++;
        else
            p++;

        //Q19
        System.out.println("19.\tWhich are you more successful at?");
        System.out.println("\tA.\tfollowing a carefully worked out plan");
        System.out.println("\tB.\tquickly dealing with the unexpected\n");

        response = response();

        if (response == 'A')
            j++;
        else
            p++;

        //Q20
        System.out.println("20.\tWould you rather be considered a:");
        System.out.println("\tA.\tpractical person");
        System.out.println("\tB.\ta person who thinks out-of-the box\n");

        response = response();

        if (response == 'A')
            s += 2;
        else
            n += 2;

        //Q21
        System.out.println("21.\tIn a large group, which do you do most often?");
        System.out.println("\tA.\tintroduce others");
        System.out.println("\tB.\tget introduced\n");

        response = response();

        if (response == 'A')
            e += 2;
        else
            i += 2;

        //Q22
        System.out.println("22.\tDo you usually:");
        System.out.println("\tA.\tvalue emotion more than logic");
        System.out.println("\tB.\tvalue logic more than feelings\n");

        response = response();

        if (response == 'A')
            f += 2;
        else
            t += 2;

        //Q23
        System.out.println("23.\tWho would you rather have as a friend?");
        System.out.println("\tA.\tSomeone who is always coming up with new ideas");
        System.out.println("\tB.\tSomeone who has both feet on the ground\n");

        response = response();

        if (response == 'A')
            n++;
        else
            s += 2;

        //Q24
        System.out.println("24.\tWhen meeting someone new, they can tell what you are interested in:");
        System.out.println("\tA.\tright away");
        System.out.println("\tB.\tonly after they really get to know you\n");

        response = response();

        if (response == 'A')
            e++;
        else
            i++;

        //Q25
        System.out.println("25.\tIn your daily work, do you");
        System.out.println("\tA.\tusually plan your work to avoid stress");
        System.out.println("\tB.\trather enjoy an emergency that makes you work against time");
        System.out.println("\tC.\thate to work under pressure?");
        System.out.println("\tD.\tA and B both apply to me.");
        System.out.println("\tE.\tA and C both apply to me.");
        System.out.println("\tF.\tB and C both apply to me\n");

        response = sixResponse();

        if (response == 'A' || response == 'E') {
            j++;
        } else if (response == 'B' || response == 'F') {
            p++;
        } else if (response == 'D') {
            j++;
            p++;
        }

        //Q26
        System.out.println("26.\tDo you usually");
        System.out.println("\tA.\tshow your feeling freely, or");
        System.out.println("\tB.\tkeep your feelings to yourself?\n");

        response = response();

        if (response == 'A')
            e++;

        /*****Part 2*****/
        System.out.println("*****Part 2: Which word in each pair appeals to you more?*****");
        System.out.println("(Choose based off of definitions, not how they look or sound.)\n");

        //Q27
        System.out.println("27.\tA.\tScheduled");
        System.out.println("\tB.\tUnplanned\n");

        response = response();

        if (response == 'A')
            j += 2;
        else
            p += 2;

        //Q28
        System.out.println("28.\tA.\tFacts");
        System.out.println("\tB.\tIdeas\n");

        response = response();

        if (response == 'A')
            s += 2;
        else
            n++;

        //Q29
        System.out.println("29.\tA.\tQuiet");
        System.out.println("\tB.\tHearty\n");

        response = response();

        if (response == 'A')
            i += 2;
        else
            e += 2;

        //Q30
        System.out.println("30.\tA.\tConvincing");
        System.out.println("\tB.\tTouching\n");

        response = response();

        if (response == 'A')
            t += 2;
        else
            f++;

        //Q31
        System.out.println("31.\tA.\tImaginative");
        System.out.println("\tB.\tMatter-of-fact\n");

        response = response();

        if (response == 'B')
            s += 2;

        //Q32
        System.out.println("32.\tA.\tBenefits");
        System.out.println("\tB.\tBlessings\n");

        response = response();

        if (response == 'A')
            t++;
        else
            f++;

        //Q33
        System.out.println("33.\tA.\tPeacemaker");
        System.out.println("\tB.\tJudge\n");

        response = response();

        if (response == 'B')
            t += 2;

        //Q34
        System.out.println("34.\tA.\tSystematic");
        System.out.println("\tB.\tSpontaneous\n");

        response = response();

        if (response == 'A')
            j += 2;
        else
            p += 2;

        //Q35
        System.out.println("35.\tA.\tStatement");
        System.out.println("\tB.\tConcept\n");

        response = response();

        if (response == 'A')
            s += 2;
        else
            n++;

        //Q36
        System.out.println("36.\tA.\tReserved");
        System.out.println("\tB.\tTalkative\n");

        response = response();

        if (response == 'A')
            i++;
        else
            e += 2;

        //Q37
        System.out.println("37.\tA.\tAnalyze");
        System.out.println("\tB.\tSympathize\n");

        response = response();

        if (response == 'A')
            t++;
        else
            f += 2;

        //Q38
        System.out.println("38.\tA.\tCreate");
        System.out.println("\tB.\tMake\n");

        response = response();

        if (response == 'B')
            s += 2;

        //Q39
        System.out.println("39.\tA.\tDetermined");
        System.out.println("\tB.\tDevoted\n");

        response = response();

        if (response == 'A')
            t++;
        else
            f++;

        //Q40
        System.out.println("40.\tA.\tGentle");
        System.out.println("\tB.\tFirm\n");

        response = response();

        if (response == 'A')
            f++;
        else
            t += 2;

        //Q41
        System.out.println("41.\tA.\tSystematic");
        System.out.println("\tB.\tCasual\n");

        response = response();

        if (response == 'A')
            j += 2;
        else
            p += 2;

        //Q42
        System.out.println("42.\tA.\tCertainty");
        System.out.println("\tB.\tTheory\n");

        response = response();

        if (response == 'A')
            s++;
        else
            n += 2;

        //Q43
        System.out.println("43.\tA.\tCalm");
        System.out.println("\tB.\tLively\n");

        response = response();

        if (response == 'A')
            i++;
        else
            e++;

        //Q44
        System.out.println("44.\tA.\tJustice");
        System.out.println("\tB.\tMercy\n");

        response = response();

        if (response == 'A')
            t++;
        else
            f += 2;

        //Q45
        System.out.println("45.\tA.\tFascinating");
        System.out.println("\tB.\tSensible\n");

        response = response();

        if (response == 'B')
            s += 2;

        //Q46
        System.out.println("46.\tA.\tFirm-minded");
        System.out.println("\tB.\tWarm-hearted\n");

        response = response();

        if (response == 'A')
            t +=2;

        //Q47
        System.out.println("47.\tA.\tFeeling");
        System.out.println("\tB.\tThinking\n");

        response = response();

        if (response == 'A')
            f++;
        else
            t += 2;

        //Q48
        System.out.println("48.\tA.\tLiteral");
        System.out.println("\tB.\tFigurative\n");

        response = response();

        if (response == 'A')
            s++;
        else
            n++;

        //Q49
        System.out.println("49.\tA.\tAnticipation");
        System.out.println("\tB.\tCompassion\n");

        response = response();

        if (response == 'A')
            t+= 2;
        else
            f++;

        //Q50
        System.out.println("50.\tA.\tHard");
        System.out.println("\tB.\tSoft\n");

        response = response();

        if (response == 'A')
            t+= 2;

        //Get and print results
        printResults(getMBTI(e, i, s, n, t, f, j, p, sex));
    }

    static String getMBTI(int e, int i, int s, int n, int t, int f, int j, int p, char sex) {
        String mbti = "";

        if (i > e || e == i) {
            mbti += "I";
        } else {
            mbti += "E";
        }

        if (n > s || s == n) {
            mbti += "N";
        } else {
            mbti += "S";
        }

        if ((t == f && sex == 'M') || t > f) {
            mbti += "T";
        }  else {
            mbti += "F";
        }

        if (p > s || j == p) {
            mbti += "P";
        } else {
            mbti += "J";
        }

        return mbti;
    }
    
    static void printResults(String mbti) {
        System.out.println("Your personality type is " + mbti + ".\n");

        System.out.println("Mind:");
        if (mbti.charAt(0) == 'E') {
            System.out.println("Extraverted (E) - prefer group activities, think while speaking, get energized by social interaction.\n");
        } else {
            System.out.println("Introverted (I) - prefer solitary activities, think before speaking, get exhausted by social interaction.\n");
        }
        
        System.out.println("Energy:");
        if (mbti.charAt(1) == 'S') {
            System.out.println("Sensing (S) - down-to-earth, rely on senses, absorbed in practical matters, focus on what has happened.\n");
        } else {
            System.out.println("Intuitive (N) - imaginative, rely on intuition, absorbed in ideas, focus on what might happen.\n");
        }

        System.out.println("Nature:");
        if (mbti.charAt(2) == 'T') {
            System.out.println("Thinking (T) - tough, follow their minds, focus on objectivity and rationality.\n");
        } else {
            System.out.println("Feeling (F) - sensitive, follow their hearts, focus on harmony and cooperation.\n");
        }

        System.out.println("Tactics:");
        if (mbti.charAt(3) == 'J') {
            System.out.println("Judging (J) - decisive, prefer clear rules and guidelines, see deadlines as sacred, seek closure.\n");
        } else {
            System.out.println("Perceiving (P) - very good at improvising, prefer keeping their options open, relaxed about their work, seek freedom.\n");
        }
    }
    
    static char response() {
        Scanner in = new Scanner(System.in);
        char response;
        System.out.print("Please enter A or B: ");
        response = Character.toUpperCase(in.next().charAt(0));
        System.out.print("\n");

        if (response == 'A' || response == 'B') {
            return response;
        } else {
            boolean invalidInput = true;
            while (invalidInput) {
                System.out.print("Invalid input. Please enter A or B: ");
                response = Character.toUpperCase(in.next().charAt(0));
                if (response == 'A' || response == 'B')
                    invalidInput = false;
            }
            System.out.println();
        }
        return response;
    }

    static char threeResponse() {
        Scanner in = new Scanner(System.in);
        char response = 0;
        System.out.print("Please enter A, B, or C: ");
        response = Character.toUpperCase(in.next().charAt(0));
        System.out.println();

        if (response == 'A' || response == 'B' || response == 'C') {
            return response;
        } else {
            boolean invalidInput = true;
            while (invalidInput) {
                System.out.print("Invalid input. Please enter A, B, or C: ");
                response = Character.toUpperCase(in.next().charAt(0));
                if (response == 'A' || response == 'B' || response == 'C')
                    invalidInput = false;
            }
            System.out.println();
        }
        return response;
    }

    static char sixResponse() {
        Scanner in = new Scanner(System.in);
        char response = 0;
        System.out.print("Please enter A, B, C, D, E, or F: ");
        response = Character.toUpperCase(in.next().charAt(0));
        System.out.print("\n");

        if (response == 'A' || response == 'B' || response == 'C' || response == 'D' || response == 'E' || response == 'F') {
            return response;
        } else {
            boolean invalidInput = true;
            while (invalidInput) {
                System.out.print("Invalid input. Please enter A, B, C, D, E, or F: ");
                response = Character.toUpperCase(in.next().charAt(0));
                if (response == 'A' || response == 'B' || response == 'C' || response == 'D' || response == 'E' || response == 'F')
                    invalidInput = false;
            }
            System.out.println();
        }
        return response;
    }
}
