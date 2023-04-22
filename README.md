# 新冠食疗/新冠食康/菜谱的SpringBoot后端  
Android端在我的另一个仓库: ``` https://github.com/Chen1fly/FoodCare_App ```
## 功能  
主要处理登录注册患者状态查询等逻辑  
## 使用指南  
请将项目导入idea，创建自己的数据库（已附上），将SpringBoot的配置文件中数据库地址改为自己的即可  
## 项目结构  
``` 
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─food
    │  │          ├─controller
    │  │          ├─dao
    │  │          ├─entity
    │  │          ├─service
    │  │          └─utils
    │  └─resources
    │      ├─com
    │      │  └─food
    │      │      ├─mapper
    │      │      └─sql
    │      ├─static
    │      │  ├─css
    │      │  │  └─example
    │      │  ├─fonts
    │      │  ├─img
    │      │  ├─js
    │      │  │  └─example
    │      │  ├─lib
    │      │  │  └─codemirror
    │      │  │      ├─addon
    │      │  │      │  ├─comment
    │      │  │      │  ├─dialog
    │      │  │      │  ├─display
    │      │  │      │  ├─edit
    │      │  │      │  ├─fold
    │      │  │      │  ├─hint
    │      │  │      │  ├─lint
    │      │  │      │  ├─merge
    │      │  │      │  ├─mode
    │      │  │      │  ├─runmode
    │      │  │      │  ├─scroll
    │      │  │      │  ├─search
    │      │  │      │  ├─selection
    │      │  │      │  ├─tern
    │      │  │      │  └─wrap
    │      │  │      ├─lib
    │      │  │      ├─mode
    │      │  │      │  ├─apl
    │      │  │      │  ├─asterisk
    │      │  │      │  ├─clike
    │      │  │      │  ├─clojure
    │      │  │      │  ├─cobol
    │      │  │      │  ├─coffeescript
    │      │  │      │  ├─commonlisp
    │      │  │      │  ├─css
    │      │  │      │  ├─cypher
    │      │  │      │  ├─d
    │      │  │      │  ├─dart
    │      │  │      │  ├─diff
    │      │  │      │  ├─django
    │      │  │      │  ├─dockerfile
    │      │  │      │  ├─dtd
    │      │  │      │  ├─dylan
    │      │  │      │  ├─ebnf
    │      │  │      │  ├─ecl
    │      │  │      │  ├─eiffel
    │      │  │      │  ├─erlang
    │      │  │      │  ├─forth
    │      │  │      │  ├─fortran
    │      │  │      │  ├─gas
    │      │  │      │  ├─gfm
    │      │  │      │  ├─gherkin
    │      │  │      │  ├─go
    │      │  │      │  ├─groovy
    │      │  │      │  ├─haml
    │      │  │      │  ├─haskell
    │      │  │      │  ├─haxe
    │      │  │      │  ├─htmlembedded
    │      │  │      │  ├─htmlmixed
    │      │  │      │  ├─http
    │      │  │      │  ├─idl
    │      │  │      │  ├─jade
    │      │  │      │  ├─javascript
    │      │  │      │  ├─jinja2
    │      │  │      │  ├─julia
    │      │  │      │  ├─kotlin
    │      │  │      │  ├─livescript
    │      │  │      │  ├─lua
    │      │  │      │  ├─markdown
    │      │  │      │  ├─mirc
    │      │  │      │  ├─mllike
    │      │  │      │  ├─modelica
    │      │  │      │  ├─nginx
    │      │  │      │  ├─ntriples
    │      │  │      │  ├─octave
    │      │  │      │  ├─pascal
    │      │  │      │  ├─pegjs
    │      │  │      │  ├─perl
    │      │  │      │  ├─php
    │      │  │      │  ├─pig
    │      │  │      │  ├─properties
    │      │  │      │  ├─puppet
    │      │  │      │  ├─python
    │      │  │      │  ├─q
    │      │  │      │  ├─r
    │      │  │      │  ├─rpm
    │      │  │      │  │  └─changes
    │      │  │      │  ├─rst
    │      │  │      │  ├─ruby
    │      │  │      │  ├─rust
    │      │  │      │  ├─sass
    │      │  │      │  ├─scheme
    │      │  │      │  ├─shell
    │      │  │      │  ├─sieve
    │      │  │      │  ├─slim
    │      │  │      │  ├─smalltalk
    │      │  │      │  ├─smarty
    │      │  │      │  ├─smartymixed
    │      │  │      │  ├─solr
    │      │  │      │  ├─soy
    │      │  │      │  ├─sparql
    │      │  │      │  ├─spreadsheet
    │      │  │      │  ├─sql
    │      │  │      │  ├─stex
    │      │  │      │  ├─stylus
    │      │  │      │  ├─tcl
    │      │  │      │  ├─textile
    │      │  │      │  ├─tiddlywiki
```
