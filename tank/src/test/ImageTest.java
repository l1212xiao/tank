package test;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;


public class ImageTest {

    @Test
    public void test() {

        try {
            // BufferedImage image = ImageIO.read(new File("C:/work/javaprojects/Tank_60/src/images/bulletD.gif"));
            // BufferedImage image = ImageIO.read(new File("/Users/admin/IdeaProjects/msb/tank/tank/src/images/bulletD.gif"));
            // assertNotNull(image);

            // InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream( "images" + File.separator + "bulletD.gif");
            // BufferedImage image2 = ImageIO.read(resourceAsStream);
            BufferedImage image2 = ImageIO.read(ImageTest.class.getClassLoader().getResourceAsStream("images/bulletD.gif"));
            //this.getClass()
            assertNotNull(image2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
