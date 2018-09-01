package cn.ghy.generator;

import org.junit.Test;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/29 14:06
 * @Description:
 */
public class MpGenerator {

  @Test
  public void generateCode() {
    String packageName = "cn.ghy";
    boolean serviceNameStartWithI = false;//user -> UserService, 设置成true: user -> IUserService
    generateByTables(serviceNameStartWithI, packageName, "user_role", "permission","role_permission");
  }

  private void generateByTables(boolean serviceNameStartWithI, String packageName, String...
      tableNames) {
    GlobalConfig config = new GlobalConfig();
    config.setEnableCache(false);
    String dbUrl = "jdbc:mysql://localhost:3306/larva?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false";
    DataSourceConfig dataSourceConfig = new DataSourceConfig();
    dataSourceConfig.setDbType(DbType.MYSQL)
        .setUrl(dbUrl)
        .setUsername("root")
        .setPassword("APTX4869")
        .setDriverName("com.mysql.cj.jdbc.Driver");
    StrategyConfig strategyConfig = new StrategyConfig();
    strategyConfig
        .setCapitalMode(true)
        .setEntityLombokModel(false)
        .setDbColumnUnderline(true)
        .setNaming(NamingStrategy.underline_to_camel)
        .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
    config.setActiveRecord(false)
        .setAuthor("Ziyang")
        .setOutputDir("E:\\Ziyang\\Documents\\GitHub\\larva\\src\\main\\java")
        .setFileOverride(true);
    if (!serviceNameStartWithI) {
      config.setServiceName("%sService");
    }
    new AutoGenerator().setGlobalConfig(config)
        .setDataSource(dataSourceConfig)
        .setStrategy(strategyConfig)
        .setPackageInfo(
            new PackageConfig()
                .setParent(packageName)
                .setController("controller")
                .setEntity("entity")
        ).execute();
  }

  private void generateByTables(String packageName, String... tableNames) {
    generateByTables(true, packageName, tableNames);
  }
}