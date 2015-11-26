package net.iponweb.disthene.reader.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Andrei Ivanov
 */
@Getter
@Setter
@ToString
public class DistheneReaderConfiguration {
    private ReaderConfiguration reader;
    private StoreConfiguration store;
    private IndexConfiguration index;
    private StatsConfiguration stats;
}
