/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalitymatrix;

import java.util.Scanner;
import java.applet.*;
import java.awt.*;

/**
 *
 * @author Tim Palmieri
 */
public class PersonalityMatrix extends Applet{

    public void paint(Graphics g){
      g.drawString("Welcome in Java Applet.",40,20);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        //System.out.println(name);
        System.out.println();
        System.out.println();
        
        
        System.out.println("1. I learn best when I…");
        System.out.println();
        System.out.println("(a) rely on logical thinking and facts.");
        System.out.println("(b) am personally involved.");
        System.out.println("(c) can look for new patterns through trial and error.");
        System.out.println("(d) use hands on activities and practical applications.");
        System.out.println();
        String str1 = sc.next();
        for (int i = 0; i < str1.length(); i++) {
            if (i == 0) {
                if (str1.charAt(i) == 'a') {
                    a += 4;
                }
                if (str1.charAt(i) == 'b') {
                    b += 4;
                }
                if (str1.charAt(i) == 'c') {
                    c += 4;
                }
                if (str1.charAt(i) == 'd') {
                    d += 4;
                }
            }
            if (i == 1) {
                if (str1.charAt(i) == 'a') {
                    a += 3;
                }
                if (str1.charAt(i) == 'b') {
                    b += 3;
                }
                if (str1.charAt(i) == 'c') {
                    c += 3;
                }
                if (str1.charAt(i) == 'd') {
                    d += 3;
                }
            }
            if (i == 2) {
                if (str1.charAt(i) == 'a') {
                    a += 2;
                }
                if (str1.charAt(i) == 'b') {
                    b += 2;
                }
                if (str1.charAt(i) == 'c') {
                    c += 2;
                }
                if (str1.charAt(i) == 'd') {
                    d += 2;
                }
            }
            if (i == 3) {
                if (str1.charAt(i) == 'a') {
                    a += 1;
                }
                if (str1.charAt(i) == 'b') {
                    b += 1;
                }
                if (str1.charAt(i) == 'c') {
                    c += 1;
                }
                if (str1.charAt(i) == 'd') {
                    d += 1;
                }
            }

        }
        System.out.println();
        
        System.out.println("2. When I’m at my best, I’m described as…");
        System.out.println();
        System.out.println("(a) dependable, accurate, logical, and objective.");
        System.out.println("(b) understanding, loyal, cooperative, and harmonious.");
        System.out.println("(c) imaginative, flexible, open-minded, and creative.");
        System.out.println("(d) confident, assertive, practical, and results-oriented.");
        System.out.println();
        String str2 = sc.next();
        for (int i = 0; i < str2.length(); i++) {
            if (i == 0) {
                if (str2.charAt(i) == 'a') {
                    a += 4;
                }
                if (str2.charAt(i) == 'b') {
                    b += 4;
                }
                if (str2.charAt(i) == 'c') {
                    c += 4;
                }
                if (str2.charAt(i) == 'd') {
                    d += 4;
                }
            }
            if (i == 1) {
                if (str2.charAt(i) == 'a') {
                    a += 3;
                }
                if (str2.charAt(i) == 'b') {
                    b += 3;
                }
                if (str2.charAt(i) == 'c') {
                    c += 3;
                }
                if (str2.charAt(i) == 'd') {
                    d += 3;
                }
            }
            if (i == 2) {
                if (str2.charAt(i) == 'a') {
                    a += 2;
                }
                if (str2.charAt(i) == 'b') {
                    b += 2;
                }
                if (str2.charAt(i) == 'c') {
                    c += 2;
                }
                if (str2.charAt(i) == 'd') {
                    d += 2;
                }
            }
            if (i == 3) {
                if (str2.charAt(i) == 'a') {
                    a += 1;
                }
                if (str2.charAt(i) == 'b') {
                    b += 1;
                }
                if (str2.charAt(i) == 'c') {
                    c += 1;
                }
                if (str2.charAt(i) == 'd') {
                    d += 1;
                }
            }

        }
        System.out.println();
        
        System.out.println("3. I respond best to instructors and bosses who…");
        System.out.println();
        System.out.println("(a) are factual and to the point.");
        System.out.println("(b) show appreciation and are friendly.");
        System.out.println("(c) encourage creativity and flexibility.");
        System.out.println("(d) expect me to be involved, be active, and get results.");
        System.out.println();
        String str3 = sc.next();
        for (int i = 0; i < str3.length(); i++) {
            if (i == 0) {
                if (str3.charAt(i) == 'a') {
                    a += 4;
                }
                if (str3.charAt(i) == 'b') {
                    b += 4;
                }
                if (str3.charAt(i) == 'c') {
                    c += 4;
                }
                if (str3.charAt(i) == 'd') {
                    d += 4;
                }
            }
            if (i == 1) {
                if (str3.charAt(i) == 'a') {
                    a += 3;
                }
                if (str3.charAt(i) == 'b') {
                    b += 3;
                }
                if (str3.charAt(i) == 'c') {
                    c += 3;
                }
                if (str3.charAt(i) == 'd') {
                    d += 3;
                }
            }
            if (i == 2) {
                if (str3.charAt(i) == 'a') {
                    a += 2;
                }
                if (str3.charAt(i) == 'b') {
                    b += 2;
                }
                if (str3.charAt(i) == 'c') {
                    c += 2;
                }
                if (str3.charAt(i) == 'd') {
                    d += 2;
                }
            }
            if (i == 3) {
                if (str3.charAt(i) == 'a') {
                    a += 1;
                }
                if (str3.charAt(i) == 'b') {
                    b += 1;
                }
                if (str3.charAt(i) == 'c') {
                    c += 1;
                }
                if (str3.charAt(i) == 'd') {
                    d += 1;
                }
            }

        }
        System.out.println();
       
        System.out.println("4. When working in a group, I tend to value…");
        System.out.println();
        System.out.println("(a) objectivity and correctness.");
        System.out.println("(b) consensus and harmony.");
        System.out.println("(c) originality and risk-taking.");
        System.out.println("(d) efficiency and results.");
        System.out.println();
        String str4 = sc.next();
        for (int i = 0; i < str4.length(); i++) {
            if (i == 0) {
                if (str4.charAt(i) == 'a') {
                    a += 4;
                }
                if (str4.charAt(i) == 'b') {
                    b += 4;
                }
                if (str4.charAt(i) == 'c') {
                    c += 4;
                }
                if (str4.charAt(i) == 'd') {
                    d += 4;
                }
            }
            if (i == 1) {
                if (str4.charAt(i) == 'a') {
                    a += 3;
                }
                if (str4.charAt(i) == 'b') {
                    b += 3;
                }
                if (str4.charAt(i) == 'c') {
                    c += 3;
                }
                if (str4.charAt(i) == 'd') {
                    d += 3;
                }
            }
            if (i == 2) {
                if (str4.charAt(i) == 'a') {
                    a += 2;
                }
                if (str4.charAt(i) == 'b') {
                    b += 2;
                }
                if (str4.charAt(i) == 'c') {
                    c += 2;
                }
                if (str4.charAt(i) == 'd') {
                    d += 2;
                }
            }
            if (i == 3) {
                if (str4.charAt(i) == 'a') {
                    a += 1;
                }
                if (str4.charAt(i) == 'b') {
                    b += 1;
                }
                if (str4.charAt(i) == 'c') {
                    c += 1;
                }
                if (str4.charAt(i) == 'd') {
                    d += 1;
                }
            }

        }
        System.out.println();
        
        System.out.println("5. I am most comfortable with people who are…");
        System.out.println();
        System.out.println("(a) informed, serious, and accurate.");
        System.out.println("(b) supportive, appreciative, and friendly.");
        System.out.println("(c) creative, unique, and idealistic.");
        System.out.println("(d) productive, realistic, and dependable.");
        System.out.println();
        String str5 = sc.next();
        for (int i = 0; i < str5.length(); i++) {
            if (i == 0) {
                if (str5.charAt(i) == 'a') {
                    a += 4;
                }
                if (str5.charAt(i) == 'b') {
                    b += 4;
                }
                if (str5.charAt(i) == 'c') {
                    c += 4;
                }
                if (str5.charAt(i) == 'd') {
                    d += 4;
                }
            }
            if (i == 1) {
                if (str5.charAt(i) == 'a') {
                    a += 3;
                }
                if (str5.charAt(i) == 'b') {
                    b += 3;
                }
                if (str5.charAt(i) == 'c') {
                    c += 3;
                }
                if (str5.charAt(i) == 'd') {
                    d += 3;
                }
            }
            if (i == 2) {
                if (str5.charAt(i) == 'a') {
                    a += 2;
                }
                if (str5.charAt(i) == 'b') {
                    b += 2;
                }
                if (str5.charAt(i) == 'c') {
                    c += 2;
                }
                if (str5.charAt(i) == 'd') {
                    d += 2;
                }
            }
            if (i == 3) {
                if (str5.charAt(i) == 'a') {
                    a += 1;
                }
                if (str5.charAt(i) == 'b') {
                    b += 1;
                }
                if (str5.charAt(i) == 'c') {
                    c += 1;
                }
                if (str5.charAt(i) == 'd') {
                    d += 1;
                }
            }

        }

        System.out.println();
        
        System.out.println("6. Generally, I am…");
        System.out.println();
        System.out.println("(a) methodical, efficient, trustworthy, and accurate.");
        System.out.println("(b) cooperative, genuine, gentle, and modest.");
        System.out.println("(c) high-spirited, spontaneous, easily bored, and dramatic.");
        System.out.println("(d) straightforward, conservative, responsible, and decisive.");
        System.out.println();
        String str6 = sc.next();
        for (int i = 0; i < str6.length(); i++) {
            if (i == 0) {
                if (str6.charAt(i) == 'a') {
                    a += 4;
                }
                if (str6.charAt(i) == 'b') {
                    b += 4;
                }
                if (str6.charAt(i) == 'c') {
                    c += 4;
                }
                if (str6.charAt(i) == 'd') {
                    d += 4;
                }
            }
            if (i == 1) {
                if (str6.charAt(i) == 'a') {
                    a += 3;
                }
                if (str6.charAt(i) == 'b') {
                    b += 3;
                }
                if (str6.charAt(i) == 'c') {
                    c += 3;
                }
                if (str6.charAt(i) == 'd') {
                    d += 3;
                }
            }
            if (i == 2) {
                if (str6.charAt(i) == 'a') {
                    a += 2;
                }
                if (str6.charAt(i) == 'b') {
                    b += 2;
                }
                if (str6.charAt(i) == 'c') {
                    c += 2;
                }
                if (str6.charAt(i) == 'd') {
                    d += 2;
                }
            }
            if (i == 3) {
                if (str6.charAt(i) == 'a') {
                    a += 1;
                }
                if (str6.charAt(i) == 'b') {
                    b += 1;
                }
                if (str6.charAt(i) == 'c') {
                    c += 1;
                }
                if (str6.charAt(i) == 'd') {
                    d += 1;
                }
            }

        }

        System.out.println();
        
        System.out.println("7. When making a decision, I’m generally concerned with…");
        System.out.println();
        System.out.println("(a) collecting information and facts to determine the right solution.");
        System.out.println("(b) finding the solution that pleases others and me.");
        System.out.println("(c) brainstorming creative solutions that feel right.");
        System.out.println("(d) quickly choosing the most practical and realistic solution.");
        System.out.println();
        String str7 = sc.next();
        for (int i = 0; i < str7.length(); i++) {
            if (i == 0) {
                if (str7.charAt(i) == 'a') {
                    a += 4;
                }
                if (str7.charAt(i) == 'b') {
                    b += 4;
                }
                if (str7.charAt(i) == 'c') {
                    c += 4;
                }
                if (str7.charAt(i) == 'd') {
                    d += 4;
                }
            }
            if (i == 1) {
                if (str7.charAt(i) == 'a') {
                    a += 3;
                }
                if (str7.charAt(i) == 'b') {
                    b += 3;
                }
                if (str7.charAt(i) == 'c') {
                    c += 3;
                }
                if (str7.charAt(i) == 'd') {
                    d += 3;
                }
            }
            if (i == 2) {
                if (str7.charAt(i) == 'a') {
                    a += 2;
                }
                if (str7.charAt(i) == 'b') {
                    b += 2;
                }
                if (str7.charAt(i) == 'c') {
                    c += 2;
                }
                if (str7.charAt(i) == 'd') {
                    d += 2;
                }
            }
            if (i == 3) {
                if (str7.charAt(i) == 'a') {
                    a += 1;
                }
                if (str7.charAt(i) == 'b') {
                    b += 1;
                }
                if (str7.charAt(i) == 'c') {
                    c += 1;
                }
                if (str7.charAt(i) == 'd') {
                    d += 1;
                }
            }

        }
        
        System.out.println();
        
        System.out.println("8. You could describe me in one word as…");
        System.out.println();
        System.out.println("(a) analytical.");
        System.out.println("(b) caring.");
        System.out.println("(c) innovative.");
        System.out.println("(d) productive.");
        System.out.println();
        String str8 = sc.next();
        for (int i = 0; i < str8.length(); i++) {
            if (i == 0) {
                if (str8.charAt(i) == 'a') {
                    a += 4;
                }
                if (str8.charAt(i) == 'b') {
                    b += 4;
                }
                if (str8.charAt(i) == 'c') {
                    c += 4;
                }
                if (str8.charAt(i) == 'd') {
                    d += 4;
                }
            }
            if (i == 1) {
                if (str8.charAt(i) == 'a') {
                    a += 3;
                }
                if (str8.charAt(i) == 'b') {
                    b += 3;
                }
                if (str8.charAt(i) == 'c') {
                    c += 3;
                }
                if (str8.charAt(i) == 'd') {
                    d += 3;
                }
            }
            if (i == 2) {
                if (str8.charAt(i) == 'a') {
                    a += 2;
                }
                if (str8.charAt(i) == 'b') {
                    b += 2;
                }
                if (str8.charAt(i) == 'c') {
                    c += 2;
                }
                if (str8.charAt(i) == 'd') {
                    d += 2;
                }
            }
            if (i == 3) {
                if (str8.charAt(i) == 'a') {
                    a += 1;
                }
                if (str8.charAt(i) == 'b') {
                    b += 1;
                }
                if (str8.charAt(i) == 'c') {
                    c += 1;
                }
                if (str8.charAt(i) == 'd') {
                    d += 1;
                }
            }

        }
        
        System.out.println();
       
        System.out.println("9. I excel at...");
        System.out.println();
        System.out.println("(a) reaching accurate and logical conclusions.");
        System.out.println("(b) being cooperative and respecting people’s feelings.");
        System.out.println("(c) finding hidden connections and creative outcomes.");
        System.out.println("(d) making realistic, practical, and timely decisions.");
        System.out.println();
        String str9 = sc.next();
        for (int i = 0; i < str9.length(); i++) {
            if (i == 0) {
                if (str9.charAt(i) == 'a') {
                    a += 4;
                }
                if (str9.charAt(i) == 'b') {
                    b += 4;
                }
                if (str9.charAt(i) == 'c') {
                    c += 4;
                }
                if (str9.charAt(i) == 'd') {
                    d += 4;
                }
            }
            if (i == 1) {
                if (str9.charAt(i) == 'a') {
                    a += 3;
                }
                if (str9.charAt(i) == 'b') {
                    b += 3;
                }
                if (str9.charAt(i) == 'c') {
                    c += 3;
                }
                if (str9.charAt(i) == 'd') {
                    d += 3;
                }
            }
            if (i == 2) {
                if (str9.charAt(i) == 'a') {
                    a += 2;
                }
                if (str9.charAt(i) == 'b') {
                    b += 2;
                }
                if (str9.charAt(i) == 'c') {
                    c += 2;
                }
                if (str9.charAt(i) == 'd') {
                    d += 2;
                }
            }
            if (i == 3) {
                if (str9.charAt(i) == 'a') {
                    a += 1;
                }
                if (str9.charAt(i) == 'b') {
                    b += 1;
                }
                if (str9.charAt(i) == 'c') {
                    c += 1;
                }
                if (str9.charAt(i) == 'd') {
                    d += 1;
                }
            }

        }
        
        System.out.println();
        
        System.out.println("10. When learning at school or on the job, I enjoy…");
        System.out.println();
        System.out.println("(a) gathering facts, technical information, and being objective.");
        System.out.println("(b) making personal connections, being supportive, working in groups.");
        System.out.println("(c) exploring new possibilities, tackling creative tasks, and being flexible.");
        System.out.println("(d) producing results, solving problems, and making decisions.");
        System.out.println();
        String str10 = sc.next();
        for (int i = 0; i < str10.length(); i++) {
            if (i == 0) {
                if (str10.charAt(i) == 'a') {
                    a += 4;
                }
                if (str10.charAt(i) == 'b') {
                    b += 4;
                }
                if (str10.charAt(i) == 'c') {
                    c += 4;
                }
                if (str10.charAt(i) == 'd') {
                    d += 4;
                }
            }
            if (i == 1) {
                if (str10.charAt(i) == 'a') {
                    a += 3;
                }
                if (str10.charAt(i) == 'b') {
                    b += 3;
                }
                if (str10.charAt(i) == 'c') {
                    c += 3;
                }
                if (str10.charAt(i) == 'd') {
                    d += 3;
                }
            }
            if (i == 2) {
                if (str10.charAt(i) == 'a') {
                    a += 2;
                }
                if (str10.charAt(i) == 'b') {
                    b += 2;
                }
                if (str10.charAt(i) == 'c') {
                    c += 2;
                }
                if (str10.charAt(i) == 'd') {
                    d += 2;
                }
            }
            if (i == 3) {
                if (str10.charAt(i) == 'a') {
                    a += 1;
                }
                if (str10.charAt(i) == 'b') {
                    b += 1;
                }
                if (str10.charAt(i) == 'c') {
                    c += 1;
                }
                if (str10.charAt(i) == 'd') {
                    d += 1;
                }
            }

        }
        
        

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int f = 0;

        if (a > b && a > c && a > d) {
            System.out.println(name + ", you are an owl!");
            f++;
        }
        if (b > a && b > c && b > d) {
            System.out.println(name + ", you are a koala!");
            f++;
        }
        if (c > a && c > b && c > d) {
            System.out.println(name + ", you are a peacock!");
            f++;
        }
        if (d > a && d > c && d > b) {
            System.out.println(name + ", you are a lion!");
            f++;
        }

        if (f == 0) {
            if (a == b) {
                System.out.println(name + ", you resemble the qualities of both an owl and a koala!");
            }
            if (a == c) {
                System.out.println(name + ", you resemble the qualities of both an owl and a peacock!");
            }
            if (a == d) {
                System.out.println(name + ", you resemble the qualities of both an owl and a lion!");
            }
            if (b == c) {
                System.out.println(name + ", you resemble the qualities of both a koala and a peacock!");
            }
            if (b == d) {
                System.out.println(name + ", you resemble the qualities of both a koala and a lion!");
            }
            if (c == d) {
                System.out.println(name + ", you resemble the qualities of both a peacock and a lion!");
            }
        }
        
    }

}
