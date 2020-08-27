public class CommandsFactory {
    Memory memory;
    String string;

    public CommandsFactory(String string, Memory memory){
        this.memory = memory;
        this.string = string;
    }

    public Command createCommand(char action){
        if(action=='+'){
            return new IncrementCommand(memory);
        }else if(action=='-'){
            return new DecrementCommand(memory);
        }else if(action=='>'){
            return new NextCellCommand(memory);
        }else if(action=='<'){
            return new PrevCellCommand(memory);
        }else if(action=='.'){
            return new PrintCommand(memory);
        }else if(action=='['){
            return new PrintCommand(memory);
        }else if(action==']'){
            return new PrintCommand(memory);
        }
        else {
            throw new RuntimeException("Illegal character in the algorithm");
        }
    }

}
