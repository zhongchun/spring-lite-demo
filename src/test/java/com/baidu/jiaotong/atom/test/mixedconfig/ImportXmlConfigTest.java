/**
 * @Title: ImportXmlConfigTest.java
 * @Desc: TODO
 * @Package: com.baidu.jiaotong.atom.mixedconfig
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午6:12:23
 * @version 1.0
 */
package com.baidu.jiaotong.atom.test.mixedconfig;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.jiaotong.atom.mixedconfig.MediaPlayer;
import com.baidu.jiaotong.atom.mixedconfig.SoundSystemConfig;

/**
 * ClassName: ImportXmlConfigTest
 * 
 * @Desc: TODO
 * @author: yuzhongchun(yuzhongchun@baidu.com)
 * @date: 2018年1月30日 下午6:12:23
 * @version 1.0
 */
@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class ImportXmlConfigTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n"
                + "-Track: Sgt. Pepper's Lonely Hearts Club Band\n" + "-Track: With a Little Help from My Friends\n"
                + "-Track: Lucy in the Sky with Diamonds\n" + "-Track: Getting Better\n" + "-Track: Fixing a Hole\n",
                log.getLog());
    }

}
