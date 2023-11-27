<div align="center">
    <br/>
    <img style="width: 100px;height: 100px" src="./cocoyam-serve/src/main/resources/static/logo.png" alt="" />
    <h1 align="center">
        Yamis Admin
    </h1>
    <h4 align="center">
        类似php中laravel admin的java框架快速且灵活的后台框架
    </h4> 

</div>

![](http://106.52.14.176/home.png)
>  基于owl-admin 开发的JAVA版本  多处地方不规范 持续开发中 后续优化架构  一名phper

### 项目介绍

基于 `JAVA` 、 `amis` 开发的后台框架, 快速且灵活~

`还处于开发中 (目前只完成了基础功能, 后续会不断完善) `
`需要使用先试用owl-admin (php版本) 很成熟 目前仅供学习使用`

- 基于 amis 以 json 的方式构建页面，减少前端开发工作量，提升开发效率。
- 在 amis 150多个组件都不满足的情况下, 可自行开发前端。
- 框架为前后端分离 (不用再因为框架而束手束脚~)。


### 内置功能

- 基础后台功能
  - 后台用户管理
  - 角色管理
  - 权限管理
  - 菜单管理
- **代码生成器**
  - 保存生成记录
  - 导入/导出生成记录
  - 可使用命令清除生成的内容
  - 无需更改代码即可生成完整功能
- `amis` 全组件封装 150+ , 无需前端开发即可完成复杂页面


### 截图

![](http://106.52.14.176/home.png)
![](http://106.52.14.176/login.png)
![](http://106.52.14.176/menus.png)

### 安装-后端

> 👉 **注意: **`**Yamis Admin**`** 是参照 **`**owl-admin**`** 的java版本, 类似php的 **`**laravel Admin**`
> **      熟悉laravel admin的看见这写法就了解了**

##### 列表显示（代码案例）
```java

@GetMapping("/list-view")
public CommonAdminResp<HashMap<Object, Object>> listView() {

    HashMap<Object, Object> page = AmisFactory.Page().body(new Object[]{
        AmisFactory.
        CRUDTable().
        headerToolbar(new Object[]{
            createButton(this,"新增",null)
        }).
        api("/sys/admin/admin-roles/query-list").
        syncLocation(false).
        columns(new Object[]{
            AmisFactory.TableColumn().name("id").label("id").render(),
            AmisFactory.TableColumn().name("name").label("角色名").render(),
            AmisFactory.TableColumn().name("slug").label("标识").render(),
            AmisFactory.TableColumn().name("createdAt").label("开始时间").render(),
            AmisFactory.TableColumn().name("updatedAt").label("更新时间").render(),
            AmisFactory.Operation().label("操作").buttons(new Object[]{
                rowEditButton(this,"编辑",null),
                rowDeleteButton("/sys/admin/admin-roles/delete"),
            }).render()
        }).render(),
    }).render();

    return CommonAdminResp.success(page);
}
```
##### 新增/编辑（代码案例）
```java
/*新增视图*/
    public HashMap<Object, Object> formView() {

        String api = isEdit() ? "/sys/admin/admin-roles/edit" : "/sys/admin/admin-roles/add";
        String title = isEdit() ? "编辑" : "新增";

        return baseForm(api,title).body(
            new Object[]{
                AmisFactory.Hidden().name("id").label("id").render(),
                AmisFactory.TextControl().name("name").label("角色名").render(),
                AmisFactory.TextControl().name("slug").label("标识").render(),
            }
        ).render();

    }
```
##### 
##### 
##### 1. 创建 Yamis Admin 项目
```shell
git pull https://gitee.com/yjn61/yamis-admin.git
```

##### 2. 配置数据库信息/网站信息

> 根目录导入yamis.sql到数据库


```yaml
# 修改数据库配置
datasource:
    url: jdbc:mysql://
    username:
    password:
    driver-class-name: com.mysql.cj.jdbc.Driver
# 修改网站配置    
website:
  app_name: YamisAdmin
  logo: /logo.png
  footer: cocoyam
  url: http://localhost:8090 # 后端网站地址

    
```

##### 3. 安装maven包
安装相关依赖
```shell
mvn install
```

##### 4.启动
完成以上步骤启动即可
核心启动文件在cocoyam-serve/src/main/java/io/xiaoyu/Application.java

### 安装-前端

##### 1. 前端
代码根目录cocoyam-web为前端资源
修改前端配置cocoyam-web/.env
请求路径改为后端的服务
```shell
VITE_PROXY_URL=http://127.0.0.1:8090
```

```shell
# 先安装前端依赖
pnpm install
# 运行前端
pnpm run dev
```

##### 5. 运行项目
启动服务, 访问 前端服务 `/admin` 路由即可
_初始账号密码为 _`_admin 123456_`_ _

### 支持项目
如果觉得项目不错，或者已经在使用了，希望为Yamis Admin [Gitee](https://gitee.com/yjn61/yamis-admin.git) 点个 ⭐ Star，这将是对我们极大的鼓励与支持。

### 成熟的版本owl admin
为php开发的项目 此为java复刻版本

如果觉得项目不错，或者已经在使用了，希望你可以去 [Github](https://github.com/Slowlyo/owl-admin)
或者 [Gitee](https://gitee.com/slowlyo/owl-admin) 为 owl Admin点个 ⭐ Star，这将是对我们极大的鼓励与支持。


