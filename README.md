# larva

## 简介
Larva是一款基于SpringMvc的网站内容后台管理系统，内置用户管理、角色管理、板块管理、内容管理、数据分析、开发者博客等功能。

## 开发目标
- 兼容原EF数据，保留原始数据

- 友好的代码结构及注释，便于阅读及二次开发
- 采用面向声明的开发模式， 基于泛型编写极少代码即可实现复杂的功能

- 实现前后端分离，留出可供多种前端设备使用的 RESTful API 接口，方便后期开发
- 使用ReactJS进行页面交互

- 权限管理：用户、角色、权限等
- 网站通知公告
- 网站内容除标签、类别等常规属性外，可具有多种属性，如作者、日期、简介、链接，banner等（希望实现后期随时添加新属性）
- 网站的内容编辑器可以使用markdown语言，方便网站文字样式的统一
- 通用评论功能
- 通用投票（问卷）功能
- 简历投递功能
- 如有需要，可实现单点登陆

- 网站内容分析工具（调用百度统计API，方便各个子网及时了解网站访问情况）
- 多种网站管理工具，如办公室值班排班等

## 开发规范
- 前端开发规范：[网页链接](http://imweb.github.io/CodeGuide/)
- Java开发规范：[网页链接](https://github.com/alibaba/p3c/blob/master/%E9%98%BF%E9%87%8C%E5%B7%B4%E5%B7%B4Java%E5%BC%80%E5%8F%91%E6%89%8B%E5%86%8C%EF%BC%88%E8%AF%A6%E5%B0%BD%E7%89%88%EF%BC%89.pdf)
- RESTful API开发规范：[网页链接](http://www.ruanyifeng.com/blog/2014/05/restful_api.html)

## 技术选型
1、后端
- 核心框架：spring-core 5.0.7.RELEASE
- 安全框架： spring security 5.0.7.RELEASE
- 视图框架： spring webmvc 5.0.7.RELEASE
- 持久层框架： mybatis plus 2.3
- 数据库连接池： commons dbcp 1.4
- 日志管理： log4j 1.2.17
- 测试工具： junit 4.12
- Microsoft文档操作： poi 