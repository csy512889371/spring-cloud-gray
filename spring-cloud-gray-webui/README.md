npm install --registry=https://registry.npm.taobao.org

web操作界面
web操作界的源码在spring-cloud-gray-webui工程中，在源码根目录中运行npm run dev，可以运行开发环境的代码。

$ npm run dev
可以在.env.development文件中修改灰度管理服务的访问地址

ENV = 'development'
VUE_APP_BASE_API = 'http://localhost:20202'
VUE_CLI_BABEL_TRANSPILE_MODULES = true
如果要编译测试环境和生产环境的发布文件，可以参考下列列表

环境	运行命令	配置文件
开发环境	npm run dev	.env.development
测试环境	npm run build:stage	.env.staging
生产环境	npm run build:prod	.env.production
编译后的文件都在根目录的dist文件夹下