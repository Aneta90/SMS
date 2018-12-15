import picocli.CommandLine;
public class Runner{

            public static void main(String[] args) throws Exception {

                CommandLineApp app = new CommandLineApp();
                new CommandLine(app).parse(args);
                app.run();
            }
        }
