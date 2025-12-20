package com.example.splitwisedec2025.service.command;

public interface iCommand {
    void execute (String input);

    boolean matches (String input);
}
