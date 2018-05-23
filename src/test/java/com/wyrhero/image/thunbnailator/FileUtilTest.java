package com.wyrhero.image.thunbnailator;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * FileUtil Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>02/23/2018</pre>
 */
public class FileUtilTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    /**
     * Method: generateImageFixWidthHeight(File srcFile, File distImgPath, int width, int height, String format)
     */
    @Test
    public void testGenerateImageFixWidthHeight() throws Exception {
        //原图
        String imageSrc = "E:\\imageExample\\dog.jpg";
        //水印图
        String watermark = "E:\\imageExample\\watermark.png";
        String targetPath = "E:\\imageExample\\1.jpg";
        String targetPath1 = "E:\\imageExample\\2.jpg";
        String targetPath2 = "E:\\imageExample\\3.jpg";
        String targetPath3 = "E:\\imageExample\\4.jpg";
        String targetPath4 = "E:\\imageExample\\5.jpg";
        String targetPath5 = "E:\\imageExample\\6.jpg";
       // FileUtil.copyFile("F:\\temp\\" + fileName, "F:\\pic\\note\\temp\\test");
       // FileUtil.generateImageFixWidthHeight(new File(imageSrc),new File("E:\\imageExample\\1519354744303481.png"),300,300,"png");


        Thumbnails.of(imageSrc).size(200,200).toFile(targetPath);
        Thumbnails.of(imageSrc).scale(0.5f).toFile(targetPath1);
        Thumbnails.of(imageSrc).size(200,200).keepAspectRatio(false).toFile(targetPath2);
        Thumbnails.of(imageSrc).size(200,200).rotate(35).toFile(targetPath3);

       // sy
        Thumbnails.of(imageSrc).size(500,500).watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(watermark)),0.5f).outputQuality(0.8f).toFile(targetPath4);
        Thumbnails.of(imageSrc).size(200,200).keepAspectRatio(false).toFile(targetPath5);


        //压缩至指定图片尺寸（例如：横400高300），保持图片不变形，多余部分裁剪掉
        int width = 400;
        int height = 300;
        BufferedImage image = ImageIO.read(new File(imageSrc));
        Thumbnails.Builder<BufferedImage> builder = null;
        int imageWidth = image.getWidth();
        int imageHeitht = image.getHeight();
        if ((float)width / height != (float)imageWidth / imageHeitht) {
            if (imageWidth > imageHeitht) {
                image = Thumbnails.of(imageSrc).height(height).asBufferedImage();
            } else {
                image = Thumbnails.of(imageSrc).width(width).asBufferedImage();
            }
            builder = Thumbnails.of(image).sourceRegion(Positions.CENTER, width, 300).size(width, height);
        } else {
            builder = Thumbnails.of(image).size(width, height);
        }
        builder.outputFormat("jpg").toFile("E:\\imageExample\\7.jpg");




    }


} 
