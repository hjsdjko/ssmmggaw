const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmmggaw/",
            name: "ssmmggaw",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmmggaw/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社区互助养老小程序"
        } 
    }
}
export default base
