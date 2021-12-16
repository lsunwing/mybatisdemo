package com.liuwei.yeb;

import java.util.Collections;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class GenerateTable {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/cc", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("liuwei") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://lw"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.liuwei.yeb") // 设置父包名
                            .moduleName("api") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D://lw")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_staff","t_role","t_menu") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
