package net.iponweb.disthene.reader.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrei Ivanov
 */
@Getter
@Setter
@ToString
public class IndexConfiguration {
    private String name;
    private String index;
    private String type;
    private List<String> cluster = new ArrayList<>();
    private int port;
    private int scroll;
    private int timeout;
    private int maxPaths;
}
