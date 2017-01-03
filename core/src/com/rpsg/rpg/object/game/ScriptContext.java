package com.rpsg.rpg.object.game;

import com.rpsg.rpg.core.Script;

/**
 * GDX-RPG {@link Script 脚本}上下文<br>
 * 其实把{@link Script}本身作为上下文也不是不可以，只是为了界面简洁就把上下文部分单独抽出来了=。=
 */
public class ScriptContext {
	public Script _script;
	
	public ScriptContext(Script script) {
		this._script = script;
	}
	
	//DEMO
	public String sleepTest(int _frame) {
		return (String)_script.set(new ScriptExecutor() {
			int frame;
			public void create() {
				frame = _frame;
			}
			
			public void act() {
				if(frame -- <= 0)
					executed("ok看下控制台是否输出了这句话（休眠了：" + _frame + "帧）");
			}
		});
	}
	
	public void print(Object object){
		System.out.println(object);
	}
	
	
}