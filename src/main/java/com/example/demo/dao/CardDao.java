package com.example.demo.dao;

import com.example.demo.entity.Card;
import com.example.demo.entity.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class CardDao {
    public List<Card> getCards(){
        Card[] cards={
                new Card("1.jpg","别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1\n","如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。"),
                new Card("2.jpg","工作日让家中电脑不再闲置，其实你可以遥控它做很多事","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？"),
                new Card("3.jpg","告别死板与沉闷，试试这款像素风汇率查询工具：像素汇率 | App+1","支持现实货币与虚拟货币的像素风汇率换算应用，还可以查看汇率走势。"),
                new Card("4.jpg","Chrome 在 10 周年之际发布了新版，除了好看还更安全"," Google 在 Chrome 十周年之际向全平台推送了 Chrome 69 正式版的更新，为我们带来了采用全新设计的 Google material theme 主题，同时还新增了许多新功能，特别在安全性方面做出了很大的提升。"),
        };
//         通过Arrays.asList方法，将数组转换成List
        List<Card> cardList= Arrays.asList(cards);
        return cardList;
    }
    //该方法返回用户对象
            public User getUser(){
            User user=new User();
            user.setName("小马哥");
            user.setAvatar("me.jpg");
            return user;
        }
}
