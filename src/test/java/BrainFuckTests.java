import Utilities.Executor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BrainFuckTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStream() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStream() {
        System.setOut(originalOut);
    }

    @Test
    public void InnerLoops(){
        Executor executor = new Executor(">++++++++[<+++++++++>-]<.>>+>+>++>[-]+<[>[->+<<++++>]<<]>.+++++++..+++.>>+++++++.<<<<+++++++++++++.>>.+++.------.----.>>+.");
        executor.execute();
        assertEquals("Hello Uorlh!",outContent.toString());
    }

    @Test
    public void Test2(){
        Executor executor = new Executor("--[----->+<]>----.[--->+<]>----.+++[->+++<]>++.++++++++.+++++.--------.-[--->+<]>--.+[->+++<]>+.++++++++.-[++>---<]>+.++[->+++<]>+.++.[->++++++<]>.+[->+++<]>.[--->+<]>----.+[---->+<]>+++.+[----->+<]>.--------.--[--->+<]>-.---[->++++<]>+.-------.---------.----.--[--->+<]>--.++++[->+++<]>.--[--->+<]>-.---[->++++<]>-.----.[--->+<]>-----.---[->++++<]>.+[->+++<]>++.++++++++++.------.--[--->+<]>-.+[----->+<]>.--------.--[--->+<]>-.---[->++++<]>.-----.[--->+<]>-----.---[->++++<]>.+++[->+++<]>.----.++++++++++++.-[->+++<]>.[-->+++<]>-.[--->+<]>-.++[---->+<]>++.[-->+++++++<]>.----.-------.----.--[--->+<]>--.++++[->+++<]>.");
        executor.execute();
        assertEquals("brainfuck gives me unease so take me to teamDev please",outContent.toString());
    }

    @Test
    public void Test3(){
        Executor executor = new Executor("-[----->+<]>.[--->++<]>--.[-->+++<]>++.--[--->++<]>.[-->+++<]>+.-[--->++<]>.+[->+++<]>.++++++++++++.++++++.-------.++++++.++[->+++<]>++.+++++++++++.++++++++.---------.-[->+++++<]>-.-[--->++<]>-.++++++++++.+[---->+<]>+++.+++++[->+++<]>.+++++++.+[->+++<]>.+++++++++++++.");
        executor.execute();
        assertEquals("3 2 1 countdown is over", outContent.toString());
    }

    @Test
    public void PICalculator(){
        Executor executor = new Executor("+++[<+>>>>>>>>++++++++++<<<<<<<-]>+++++[<+++++++++>-]+>>>>>>+[<<+++[>>[-<]<[>]<-]>>" +
                "[>+>]<[<]>]>[[->>>>+<<<<]>>>+++>-]<[<<<<]<<<<<<<<+[->>>>>>>>>>>>[<+[->>>>+<<<<]>" +
                ">>>>]<<<<[>>>>>[<<<<+>>>>-]<<<<<-[<<++++++++++>>-]>>>[<<[<+<<+>>>-]<[>+<-]<++<<+" +
                ">>>>>>-]<<[-]<<-<[->>+<-[>>>]>[[<+>-]>+>>]<<<<<]>[-]>+<<<-[>>+<<-]<]<<<<+>>>>>>>" +
                ">[-]>[<<<+>>>-]<<++++++++++<[->>+<-[>>>]>[[<+>-]>+>>]<<<<<]>[-]>+>[<<+<+>>>-]<<<" +
                "<+<+>>[-[-[-[-[-[-[-[-[-<->[-<+<->>]]]]]]]]]]<[+++++[<<<++++++++<++++++++>>>>-]<" +
                "<<<+<->>>>[>+<<<+++++++++<->>>-]<<<<<[>>+<<-]+<[->-<]>[>>.<<<<[+.[-]]>>-]>[>>.<<" +
                "-]>[-]>[-]>>>[>>[<<<<<<<<+>>>>>>>>-]<<-]]>>[-]<<<[-]<<<<<<<<]");
        executor.execute();
        assertEquals("3.14", outContent.toString());
    }

    @Test
    public void FibonacciCounter(){
        Executor executor = new Executor("+++++++++++" +
                ">+>>>>++++++++++++++++++++++++++++++++++++++++++++" +
                ">++++++++++++++++++++++++++++++++<<<<<<[>[>>>>>>+>" +
                "+<<<<<<<-]>>>>>>>[<<<<<<<+>>>>>>>-]<[>++++++++++[-" +
                "<-[>>+>+<<<-]>>>[<<<+>>>-]+<[>[-]<[-]]>[<<[>>>+<<<" +
                "-]>>[-]]<<]>>>[>>+>+<<<-]>>>[<<<+>>>-]+<[>[-]<[-]]" +
                ">[<<+>>[-]]<<<<<<<]>>>>>[+++++++++++++++++++++++++" +
                "+++++++++++++++++++++++.[-]]++++++++++<[->-<]>++++" +
                "++++++++++++++++++++++++++++++++++++++++++++.[-]<<" +
                "<<<<<<<<<<[>>>+>+<<<<-]>>>>[<<<<+>>>>-]<-[>>.>.<<<" +
                "[-]]<<[>>+>+<<<-]>>>[<<<+>>>-]<<[<+>-]>[<+>-]<<<-]");
        executor.execute();
        assertEquals("1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89",outContent.toString());
    }

    @Test
    public void NumbersSquares(){
        Executor executor = new Executor("+[>+++++<-]>[<+++++>-]+<+[" +
                ">[>+>+<<-]++>>[<<+>>-]>>>[-]++>[-]+" +
                ">>>+[[-]++++++>>>]<<<[[<++++++++<++>>-]+<.<[>----<-]<]" +
                "<<[>>>>>[>>>[-]+++++++++<[>-<-]+++++++++>[-[<->-]+[<<<]]<[>+<-]>]<<-]<<-" +
                "]");
        executor.execute();
        assertEquals("0\n" +
                "1\n" +
                "4\n" +
                "9\n" +
                "16\n" +
                "25\n" +
                "36\n" +
                "49\n" +
                "64\n" +
                "81\n" +
                "100\n" +
                "121\n" +
                "144\n" +
                "169\n" +
                "196\n" +
                "225\n" +
                "256\n" +
                "289\n" +
                "324\n" +
                "361\n" +
                "400\n" +
                "441\n" +
                "484\n" +
                "529\n" +
                "576\n" +
                "625\n",outContent.toString());
    }
}