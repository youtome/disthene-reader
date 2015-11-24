package net.iponweb.disthene.reader.service.index;

import com.google.common.collect.Lists;
import net.iponweb.disthene.reader.config.IndexConfiguration;
import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IndexServiceTest {
    private IndexService indexService;

    @Before
    public void setUp() throws Exception {
        IndexConfiguration indexConfiguration = new IndexConfiguration();
        indexConfiguration.setIndex("disthene");
        indexConfiguration.setMaxPaths(10000);
        indexConfiguration.setPort(9300);
        indexConfiguration.setScroll(100);
        indexConfiguration.setTimeout(100);
        indexConfiguration.setType("path");
        indexConfiguration.setName("graylog2");
        indexConfiguration.setCluster(Lists.newArrayList("10.10.68.243"));
        indexService = new IndexService(indexConfiguration);
    }

    public void testESQuery() throws Exception {
        String result = indexService.getPathsAsJsonArray("NONE", "collectd.api0*");

        assertThat(result, is(""));
    }
}