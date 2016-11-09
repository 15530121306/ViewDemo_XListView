package bwie.bean;

import java.util.List;

/**
 * Created by Shixj on 2016/11/7.
 */
public class Bean {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"    跟你们说个今天发生的真事！在公交车上 一女孩腿不舒服 没给大妈让座 大妈开始骂那女孩 说话很难听 冷嘲热风的 说人家没出息 嫁不出去怎样的 还说女孩爸妈没教好她 都怪父母教育程度低怎么怎么的 我实在听不下去了 趁人多的时候 我把那个大妈的钱包偷了！","hashId":"751fdace9eb819af23d6a022dc9c86de","unixtime":1478469230,"updatetime":"2016-11-07 05:53:50"},{"content":"女友：\u201c我就是看准你是只潜力股才逢低买入的，　　哪知道几年了，一点上升的势头都没有，当初还不如直接选只绩优股。\u201d　　男朋友：\u201c知足吧，就你那眼光，肯定去买中石油。\u201d","hashId":"82880bd35aa5b4afb5deed4cd88c47f4","unixtime":1478468630,"updatetime":"2016-11-07 05:43:50"},{"content":"乾隆下江南，乌龟挡道。　　乾隆问：\u201c王八们有何事上奏？\u201d　　乌龟道：\u201c我等有王八蛋进贡，欲求乌纱帽！\u201d　　乾隆大笑：\u201c好，哪日灯头朝下时，就让你等全部当官。\u201d　　乌龟们扣谢。　　乾隆笑道：\u201c这帮蠢王八，油灯烛头什么时候可以朝下？\u201d　　转眼300年后，电灯取代了蜡烛，　　于是，君无戏言，这些乌龟果真全部当了官。","hashId":"3aaf8abfc6486dc51242210662e672e2","unixtime":1478468630,"updatetime":"2016-11-07 05:43:50"},{"content":"班主任教两个班，另一个班的大雄喜欢他班上一美女。　　一天我对大雄说：\u201c你别喜欢她了，你和她如果真在一起了那简直就是一朵鲜花插在了牛粪上。\u201d　　他沉默了三秒，拍案而起怒道：\u201c你不能说她是牛粪！\u201d　　我更郁闷：\u201c大哥我有说你是鲜花么？\u201d","hashId":"3a127c956b9ab1039d3279b2dbfa9596","unixtime":1478468630,"updatetime":"2016-11-07 05:43:50"},{"content":"大飞上高中，学校收补课费，就给爸打电话说学校收补课费。　　爸问：\u201c多少？\u201d　　大飞说：\u201c480。\u201d　　然后只听见大飞爸对大飞妈说：\u201c孩子学校收补课费1580 。\u201d","hashId":"de4f82d80a8e59b556abcd435d85c9ac","unixtime":1478468630,"updatetime":"2016-11-07 05:43:50"},{"content":"\u201c这件好看吗？\u201d　　\u201c不好。\u201d　　\u201c这件呢？\u201d　　\u201c也不好 。\u201d　　\u201c这件总可以吧？这款丝袜我看很久了， 薄，透气，花纹什么也可以。\u201d　　\u201c大哥快走吧，我们这是去抢劫啊！\u201d","hashId":"6be0d1b16bddee1a1e49f8d6dd134f9c","unixtime":1478468630,"updatetime":"2016-11-07 05:43:50"},{"content":"邻居家的孩子昨天被老师批评了，今天哭着不上学。　　我对我女儿说，看，这是不对的，不能因为老师批评就不上学。　　我那六岁的女儿不屑的说：\u201c就是，哭什么呀？老师天天批评我，我都没哭。\u201d","hashId":"b11d2f89510b6fcabcad073d35edd7ed","unixtime":1478468630,"updatetime":"2016-11-07 05:43:50"},{"content":"月初又有新的流量，　　我让一个室友帮我在手机里下载几部日本动作片，　　并委婉地提出要不穿衣服、没有剧情的，　　室友邪恶地一笑：\u201c看不出你爱好很独特嘛。\u201d　　后来他得意地把手机交给我，　　并当面打开帮我下载的相扑比赛视频，　　我怀着无比复杂的心情表达了对他的感激，室友之间的代沟莫过于此。","hashId":"deb6dd77b034b2b1dc50645191c742aa","unixtime":1478468630,"updatetime":"2016-11-07 05:43:50"},{"content":"一队记者扑面而来：\u201c您好，先生您好，请问能问您几个问题...\u201d　　\u201c我幸福！\u201d我本能地抢答。　　记者脸稍红:\u201c不是这...\u201d 　　\u201c我最开心是这月又长工资了！\u201d 　　记者:\u201c也不是，您。。\u201d 　　\u201c凝心聚力谋发展，立足岗位作贡献，喜迎大会笑开颜！\u201d　　记者怔怔地看着我，狠狠地道：\u201c谢谢！\u201d","hashId":"c732103914bf115ef0825c654057a1fb","unixtime":1478468630,"updatetime":"2016-11-07 05:43:50"},{"content":"狗对熊说：嫁给我吧，你会幸福的。　　熊说：嫁你生狗熊，我要嫁给猫，　　生熊猫才尊贵，说明选择很重要。","hashId":"375a326fd5f28bbb0ead71646e4f88e2","unixtime":1478468630,"updatetime":"2016-11-07 05:43:50"}]}
     */

    public int error_code;
    public String reason;
    public ResultBean result;

    public static class ResultBean {
        /**
         * content :     跟你们说个今天发生的真事！在公交车上 一女孩腿不舒服 没给大妈让座 大妈开始骂那女孩 说话很难听 冷嘲热风的 说人家没出息 嫁不出去怎样的 还说女孩爸妈没教好她 都怪父母教育程度低怎么怎么的 我实在听不下去了 趁人多的时候 我把那个大妈的钱包偷了！
         * hashId : 751fdace9eb819af23d6a022dc9c86de
         * unixtime : 1478469230
         * updatetime : 2016-11-07 05:53:50
         */

        public List<DataBean> data;

        public static class DataBean {
            public String content;
            public String hashId;
            public int unixtime;
            public String updatetime;
        }
    }
}
