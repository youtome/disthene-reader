package net.iponweb.disthene.reader.utils;

import static org.junit.Assert.assertEquals;

public class WildcardUtilTest {

    public void testGetPathsRegExFromWildcard() throws Exception {
        String queryPath = WildcardUtil.getPathsRegExFromWildcard("path:collectd.api0*.rss*.cpu.percent-user");

        assertEquals(queryPath, "");
    }
}