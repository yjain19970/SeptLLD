package com.example.splitwisedec2025;

import java.util.ArrayList;
import java.util.List;

import com.example.splitwisedec2025.service.command.SettleUpUserCommand;
import com.example.splitwisedec2025.service.command.iCommand;

public class CommandExecutor {
    private List<iCommand> commands = new ArrayList<>();

    public CommandExecutor(SettleUpUserCommand settleUpUser) {
        commands.add(settleUpUser);
    }

    public void addCommand(iCommand command) {
    }

    public void removeCommand(iCommand command) {
    }

    public void execute(String input) {
        for (iCommand command: commands) {
            if (command.matches(input)) {
                command.execute(input);
                break;
            }
        }
    }

}
