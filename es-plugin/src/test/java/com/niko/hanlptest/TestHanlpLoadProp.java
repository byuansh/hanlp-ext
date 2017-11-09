package com.niko.hanlptest;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.utility.Predefine;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TestHanlpLoadProp {

    private Logger logger = LoggerFactory.getLogger(TestHanlpLoadProp.class);

    @Test
    public void testLoadProp() {
        Predefine.HANLP_PROPERTIES_PATH = "D:\\hanlp.properties";
        List<Term> segs = HanLP.segment("重庆电商物流仓库人员");
        for (Term term : segs) {
            logger.info("term={}", term.toString());
        }
    }
}
