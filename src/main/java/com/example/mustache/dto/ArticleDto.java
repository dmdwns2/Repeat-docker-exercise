package com.example.mustache.dto;

import com.example.mustache.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class ArticleDto {

    private Long id;
    private String content;
    private String title;

    public Article toEntity() {
        return new Article(this.id, this.title, this.content);
    }
}
