
Spring Cloud 全家桶：

<center>
    <table width="800">
	<tr><td width="300">服务注册中心</td><td width="500">Spring Cloud Netflix Eureka</td></tr>
	<tr><td width="300">服务调用方式</td><td width="500">REST API</td></tr>
	<tr><td width="300">服务网关</td><td width="500">Spring Cloud Netflix Zuul</td></tr>
    	<tr><td width="300">断路器</td><td width="500">Spring Cloud Netflix Hystrix</td></tr>
    	<tr><td width="300">分布式配置</td><td width="500">Spring Cloud Config</td></tr>
    	<tr><td width="300">服务跟踪</td><td width="500">Spring Cloud Sleuth</td></tr>
	<tr><td width="300">消息总线</td><td width="500">Spring Cloud Bus</td></tr>
	<tr><td width="300">数据流</td><td width="500">Spring Cloud Stream</td></tr>
	<tr><td width="300">批量任务</td><td width="500">Spring Cloud Task</td></tr>
    </table>
</center>
启动顺序</br>
	mask-eureka 服务中心</br>
	mask-getway api网关</br>
	mask-consul </br>
	mask-zipkin 日志分析</br>
	mask-feign  服务调用中心</br>
	mask-user   用户模板</br>
	mask-order  订单模块</br>
	....
持续更新中…



