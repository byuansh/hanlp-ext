package com.niko.hanlptest;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.utility.Predefine;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Properties;

public class TestHanlpLoadProp {

    private Logger logger = LoggerFactory.getLogger(TestHanlpLoadProp.class);

    @Ignore
    public void testLoadProp() {
        Predefine.HANLP_PROPERTIES_PATH = "D:\\hanlp.properties";
        List<Term> segs = HanLP.segment("重庆电商物流仓库人员");
        for (Term term : segs) {
            logger.info("term={}", term.toString());
        }
    }

    @Test
    public void testFile() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {

        }
        try (FileInputStream fin = new FileInputStream("d:\\hanlp.properties")) {
            Properties properties = new Properties();
            properties.load(fin);

            String root = properties.getProperty("root");
            logger.info("root={}", root);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }
}
