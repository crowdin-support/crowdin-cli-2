package com.crowdin.cli.commands;

import com.crowdin.cli.commands.parts.UploadSourcesCommand;
import picocli.CommandLine;

@CommandLine.Command(
    name ="sources"
)
public class UploadSourcesSubcommand extends UploadSourcesCommand {
}
